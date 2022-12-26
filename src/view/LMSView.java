package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.io.ObjectOutputStream;

import model.LMSModel;
import model.Book;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import java.io.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.LMSController;

import java.awt.Color;

/**
 *
 * @author Asus
 */

public class LMSView extends JFrame {

    private JPanel contentPane;
    public LMSModel model;
    public JTextField textField_BookID_Search;
    public JTable table;
    public JTextField textField_BookID;
    public JTextField textField_BookName;
    public JTextField textField_BookAuthor;
    public JTextField textField_BookType;
    public JTextField textField_BookPrice;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LMSView frame = new LMSView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public LMSView() {
        this.model = new LMSModel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 774, 751);

        Action action = new LMSController(this);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");
        menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        menuBar.add(menuFile);

        JMenuItem menuOpen = new JMenuItem("Open");
        menuOpen.addActionListener(action);
        menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        menuFile.add(menuOpen);

        JMenuItem menuSaveFile = new JMenuItem("Save");
        menuSaveFile.addActionListener(action);
        menuSaveFile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        menuFile.add(menuSaveFile);

        JSeparator separator = new JSeparator();
        menuFile.add(separator);

        JMenuItem menuExit = new JMenuItem("Exit");
        menuExit.addActionListener(action);
        menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        menuFile.add(menuExit);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label_Title = new JLabel("Library Management System");
        label_Title.setFont(new Font("Tahoma", Font.BOLD, 19));
        label_Title.setBounds(280, 11, 500, 54);
        contentPane.add(label_Title);

        Box verticalBox_1 = Box.createVerticalBox();
        verticalBox_1.setBounds(44, 144, -28, -35);
        contentPane.add(verticalBox_1);


        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 92, 738, 2);
        contentPane.add(separator_1);

        textField_BookID_Search = new JTextField();
        textField_BookID_Search.setFont(new Font("Tahoma", Font.PLAIN, 19));
        textField_BookID_Search.setColumns(10);
        textField_BookID_Search.setBounds(470, 520, 200, 29);
        contentPane.add(textField_BookID_Search);

        JButton btnTim = new JButton("Search");
        btnTim.addActionListener(action);
        btnTim.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnTim.setBounds(323,520 , 100, 29);
        contentPane.add(btnTim);


        table = new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 16));
        table.setModel(new DefaultTableModel(new Object[][] {},
                new String[] { "Book ID", "Book Name","Book Author","Book Type",  "Book Price"}));

        table.setRowHeight(25);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 144, 738, 214);
        contentPane.add(scrollPane);

        JSeparator separator_1_1 = new JSeparator();
        separator_1_1.setBounds(10, 369, 738, 2);
        contentPane.add(separator_1_1);

        JLabel label_BookID = new JLabel("Book ID");
        label_BookID.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_BookID.setBounds(10, 412, 102, 54);
        contentPane.add(label_BookID);

        textField_BookID = new JTextField();
        textField_BookID.setFont(new Font("Tahoma", Font.PLAIN, 19));
        textField_BookID.setColumns(10);
        textField_BookID.setBounds(127, 425, 166, 29);
        contentPane.add(textField_BookID);


        JLabel label_BookName = new JLabel("Book Name");
        label_BookName.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_BookName.setBounds(10, 457, 102, 54);
        contentPane.add(label_BookName);

        textField_BookName = new JTextField();
        textField_BookName.setFont(new Font("Tahoma", Font.PLAIN, 19));
        textField_BookName.setColumns(10);
        textField_BookName.setBounds(127, 470, 166, 29);
        contentPane.add(textField_BookName);

        JLabel label_BookAuthor = new JLabel("Book Author");
        label_BookAuthor.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_BookAuthor.setBounds(324, 412, 120, 54);
        contentPane.add(label_BookAuthor);

        textField_BookAuthor = new JTextField();
        textField_BookAuthor.setFont(new Font("Tahoma", Font.PLAIN, 19));
        textField_BookAuthor.setColumns(10);
        textField_BookAuthor.setBounds(470, 422, 200, 29);
        contentPane.add(textField_BookAuthor);

        JLabel label_BookType = new JLabel("Book Type");
        label_BookType.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_BookType.setBounds(324,470 , 166, 29);
        contentPane.add(label_BookType);

        textField_BookType = new JTextField();
        textField_BookType.setFont(new Font("Tahoma", Font.PLAIN, 19));
        textField_BookType.setColumns(10);
        textField_BookType.setBounds(470, 470, 200, 32);
        contentPane.add(textField_BookType);

        JLabel label_BookPrice = new JLabel("Book Price");
        label_BookPrice.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_BookPrice.setBounds(10, 510, 155, 54);
        contentPane.add(label_BookPrice);

        textField_BookPrice = new JTextField();
        textField_BookPrice.setFont(new Font("Tahoma", Font.PLAIN, 19));
        textField_BookPrice.setColumns(10);
        textField_BookPrice.setBounds(127, 520, 166, 29);
        contentPane.add(textField_BookPrice);

        JButton btnAdd = new JButton("Add");
        btnAdd.addActionListener(action);
        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnAdd.setBounds(40, 628, 135, 42);
        contentPane.add(btnAdd);

        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(action);
        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnDelete.setBounds(400, 628, 135, 42);
        contentPane.add(btnDelete);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(action);
        btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnUpdate.setBounds(220, 628, 135, 42);
        contentPane.add(btnUpdate);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(action);
        btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnCancel.setBounds(585, 628, 160, 42);
        contentPane.add(btnCancel);

        JSeparator separator_2 = new JSeparator();
        separator_2.setForeground(Color.BLACK);
        separator_2.setBounds(15, 628, 733, -22);
        contentPane.add(separator_2);

        JSeparator separator_1_1_1 = new JSeparator();
        separator_1_1_1.setBounds(10, 616, 738, 2);
        contentPane.add(separator_1_1_1);


        this.setVisible(true);
    }

    public void AddBookToTable(Book ts) {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        model_table.addRow(new Object[] { ts.getBookID() + "", ts.getBookName(),ts.getBookAuthor(),ts.getBookType(),
                ts.getBookPrice()});
    }

    public void AddBook(Book ts) {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        if (!this.model.CheckDuplicate(ts)) {
            this.model.insert(ts);
            this.AddBookToTable(ts);
        } else {
            JOptionPane.showMessageDialog(this, "ID Book Nay Da Ton Tai!");
            }
        }

    public Book GetSelectedBook() {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int i_row = table.getSelectedRow();

        int Bookid = Integer.valueOf(model_table.getValueAt(i_row, 0) + "");
        String Bookname = model_table.getValueAt(i_row, 1) + "";
        String Bookauthor = model_table.getValueAt(i_row, 2) + "";
        String Booktype = model_table.getValueAt(i_row, 3) + "";
        int Bookprice = Integer.valueOf(model_table.getValueAt(i_row, 4) + "");

        Book ts = new Book(Bookid, Bookname, Bookauthor, Booktype, Bookprice);
        return ts;
    }

    public void ShowChosenBook() {
        Book ts = GetSelectedBook();

        this.textField_BookID.setText(ts.getBookID() + "");
        this.textField_BookName.setText(ts.getBookName() + "");
        this.textField_BookAuthor.setText(ts.getBookAuthor() + "");
        this.textField_BookType.setText(ts.getBookType() + "");
        this.textField_BookPrice.setText(ts.getBookPrice() + "");
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int i_row = table.getSelectedRow();
        this.model.delete(ts);
        model_table.removeRow(i_row);
    }

    public void DeleteAction() {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int i_row = table.getSelectedRow();
        int Choice = JOptionPane.showConfirmDialog(this, "Confirm?");
        if (Choice == JOptionPane.YES_OPTION) {
            Book ts = GetSelectedBook();
            this.model.delete(ts);
            model_table.removeRow(i_row);
        }

    }
    public void AddBookAction() {
        if(this.textField_BookID.getText().length()==0 ||
                this.textField_BookName.getText().length()==0||
                this.textField_BookAuthor.getText().length()==0||
                this.textField_BookType.getText().length()==0||
                this.textField_BookPrice.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Please Input Book Data First!");
        }
        else{int BookID = Integer.valueOf(this.textField_BookID.getText());
        String Bookname = this.textField_BookName.getText();
        String Bookauthor = this.textField_BookAuthor.getText();
        String Booktype = this.textField_BookType.getText();
        int Bookprice = Integer.valueOf(this.textField_BookPrice.getText());

        Book ts = new Book(BookID, Bookname,Bookauthor,Booktype,  Bookprice);
        this.AddBook(ts);}
    }

    public void ReloadData() {
        while (true) {
            DefaultTableModel model_table = (DefaultTableModel) table.getModel();
            int RowCount = model_table.getRowCount();
            if(RowCount==0)
                break;
            else
                try {
                    model_table.removeRow(0);
                    this.textField_BookID.setText("");
                    this.textField_BookName.setText("");
                    this.textField_BookAuthor.setText("");
                    this.textField_BookType.setText("");
                    this.textField_BookPrice.setText("");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
        for (Book ts : this.model.getBookList()) {
            this.AddBookToTable(ts);
        }
    }

    public void Exit() {
        int Choice = JOptionPane.showConfirmDialog(
                this,
                "Exit Out Of Program?",
                "Confirm",
                JOptionPane.YES_NO_OPTION);
        if (Choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void SearchAction() {
        this.ReloadData();

        String BookIDSearch = this.textField_BookID_Search.getText();
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int RowCount = model_table.getRowCount();

        Set<Integer> idCuaBookCanXoa = new TreeSet<Integer>();
        if (BookIDSearch.length() > 0) {
            for (int i = 0; i < RowCount; i++) {
                String id = model_table.getValueAt(i, 0) + "";
                if (!id.equals(BookIDSearch)) {
                    idCuaBookCanXoa.add(Integer.valueOf(id));
                }
            }
        }
        for (Integer idCanXoa : idCuaBookCanXoa) {
            System.out.println(idCanXoa);
            RowCount = model_table.getRowCount();
            for (int i = 0; i < RowCount; i++) {
                String Idintable = model_table.getValueAt(i, 0) + "";
                if (Idintable.equals(idCanXoa.toString())) {
                    try {
                        model_table.removeRow(i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }
    }

    public void openFile(File file) {
        ArrayList<Book> books = new ArrayList<Book>();
        try {
            this.model.setFileName(file.getAbsolutePath());
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Book ts = null;
            while((ts = (Book) ois.readObject())!=null) {
                books.add(ts);
            }
            ois.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.model.setBookList(books);
    }

    public void OpenFileAction() {
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            openFile(file);
            ReloadData();
        }
    }
    public void saveFile(String path) {
        try {
            this.model.setFileName(path);
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Book ts : this.model.getBookList()) {
                oos.writeObject(ts);
            }
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SaveFileAction() {
        if(this.model.getFileName().length()>0) {
            saveFile(this.model.getFileName());
        }else {
            JFileChooser fc = new JFileChooser();
            int returnVal = fc.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                saveFile(file.getAbsolutePath());
            }
        }
    }
}