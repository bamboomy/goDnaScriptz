package genetic;
import java.util.ArrayList;
class Thought219 extends Thought{
private static ArrayList<Thought219> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 944.4509048448693;
private double fd1 = 689.7686227607805;
private Thought fo0 = null;
private Thought fo1 = null;
Thought219 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought219 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought219 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought219 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought219 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought219 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought219 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought219 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought219 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought219 instance = new Thought219 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought219 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought219 instance = new Thought219 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought219 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought219 instance = new Thought219 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought219 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought219 instance = new Thought219 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought219 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought219 instance = new Thought219 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought219 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought219 instance = new Thought219 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought219 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought219 instance = new Thought219 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought219 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought219 instance = new Thought219 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 556.992007841316;
    ld0 *= -1;
    Output.points[5][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
        ld0 = fd0 + fd1;
    lb1 = ld0 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought230.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 || ab2;
    Output.points[5][6] -= fd1;
    fd0 = fd1 + fd0;
    double ld2 = 875.8883488332949;
    boolean lb3 = true;
    boolean lb4 = false;
        ab1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld5 = 368.37292072755105;
    ab2 = !ab3;
    ld2 = ld5 + fd0;
    boolean lb6 = true;
if(fo1 != null){
      fo1.m2(fd1, ld2, ld5, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, ld5, fd0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1();
}
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Output.points[5][7] -= ad1;
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, lb2, fb0, fb1);
}
    fd1 = ad1 + ad2;
    lb0 = !lb1;
if(fo1 != null){
      lb2 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    for(int i0=0; i0<10; i0++){
        lb2 = !fb0;
        Output.points[5][8] -= ad1;
        ad2 = ad3 - ad4;
        double ld3 = 970.5768515374444;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld3, ad1);
}
        ad2 *= -1;
        Output.points[6][0] -= ad3;
        for(int i1=0; i1<10; i1++){
            boolean lb4 = true;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = ad2 > ad3;
    Thought lo0 = Thought269.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
    Thought lo1 = Thought9.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = !ab3;
    Thought lo2 = Thought44.getInstance(ad2, ad3, ad4, fd0);
    Thought lo3 = Thought265.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = ad4 < fd0;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb4, ab1);
}
    ad4 *= -1;
    ab2 = ab3 || ab4;
    fd0 *= -1;
    Thought lo5 = Thought226.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb4, ab1);
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb4, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld6 = 240.28383297674642;
    ad3 = ad4 - fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    if (fb0) {
        fd0 = fd1 + fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fd1 *= -1;
        boolean lb0 = false;
        double ld1 = 19.37562397046576;
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          ld1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
        double ld2 = 223.97865516303466;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        double ld3 = 122.15858195752939;
if(fo1 != null){
          fo1.m2(ld3, fd0, fd1, ld1);
}
        double ld4 = 502.0429037213196;
        boolean lb5 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ld3, ld4, fd0);
}
        Output.points[6][1] += fd1;
        lb0 = ld1 > ld2;
if(ao2 != null){
          ao1 = ao2.m4();
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought21.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 892.6303723815525;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld2 = 81.88222836819203;
    fb1 = fb0 || fb1;
    double ld3 = 216.59358510423053;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo4 = Thought170.getInstance(ao1, ao2, ao3, ao4);
    double ld5 = 884.1820089133527;
if(fo0 != null){
      fo0.m3(ld5, ad1, ad2, ad3);
}
    Output.points[6][2] -= ad4;
    double ld6 = 199.84778969623716;
    ad4 = fd0 + fd1;
    ld1 = ld2 - ld3;
    Thought lo7 = Thought142.getInstance(fo1, ao1, ao2, ao3, ld5, ld6, ad1, ad2);
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
        fb0 = fb1 && fb0;
if(ao4 != null){
          ad4 = ao4.m3();
}
        boolean lb8 = false;
        fd0 = fd1 - ld1;
        for(int i1=0; i1<10; i1++){
            boolean lb9 = true;
            boolean lb10 = true;
if(fo0 != null){
              ld2 = fo0.m3(lb10, lb8, fb0, fb1);
}
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      fb0 = ao3.m2(fd1, fd0, fd1, fd0);
}
    double ld1 = 982.3099716469692;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0);
}
    Thought lo2 = Thought37.getInstance();
    Thought lo3 = Thought22.getInstance(fb1, lb0, ab1, ab2);
    fd1 = ld1 + fd0;
    fd1 *= -1;
    boolean lb4 = false;
    Output.points[6][3] += ld1;
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    double ld5 = 293.5156449635167;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld1, ld5, fd0, fd1, fb0, fb1, lb0, lb4);
}
if(ao4 != null){
      ao3 = ao4.m4(ld1, ld5, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb4);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    Thought lo6 = Thought24.getInstance(ld5, fd0, fd1, ld1);
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ld5, fd0, fd1, ld1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[6][4] -= ld5;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought14.getInstance(fd0, fd1, ad1, ad2, fb1, lb0, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb2 = true;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    ad3 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought382.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    double ld1 = 583.0186006702603;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][5] -= fd1;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
        fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    fb1 = !lb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    Thought lo2 = Thought272.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb3 = true;

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    Thought lo0 = Thought48.getInstance();
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought58.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
}
    fb0 = fd0 > fd1;
    double ld3 = 257.54874354731044;
    ld3 *= -1;
    Output.points[6][6] += ad1;
    ad2 = ad3 + ad4;
    boolean lb4 = true;
    fb0 = fd0 > fd1;
    ld3 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fb1 = lb2 || lb4;
    fd1 = ld3 + ad1;
    fb0 = fb1 && lb2;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb2);
}
    boolean lb5 = true;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb5 = fb0 && fb1;
    Thought lo6 = Thought256.getInstance(ad3, ad4, fd0, fd1);
    ld3 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2);
}
    lb2 = ad3 < ad4;
    lb4 = lb5 && fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      ad4 = fo1.m3(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought263.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
    if (ab4) {
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
        ad1 = ad2 - ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        double ld1 = 494.6852592431269;
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Thought lo0 = Thought273.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    Thought lo2 = Thought390.getInstance();
    Thought lo3 = Thought145.getInstance(fb0, fb1, lb1, fb0);
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
    Thought lo4 = Thought303.getInstance(fo1, ao1, ao2, ao3);
    Output.points[6][7] -= fd1;
if(ao4 != null){
      lb1 = ao4.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb1 = lb1 && fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    fb1 = !lb0;
    fb0 = fd1 > ad1;
    fb1 = lb0 && fb0;
    double ld1 = 972.3374921904301;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
    if (fb0) {
        fd0 = fd1 + fd0;
        fb1 = !ab1;
if(ao2 != null){
          ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        ab4 = fd1 > fd0;
        fd1 *= -1;
        Thought lo0 = Thought45.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
        Thought lo1 = Thought373.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
        Thought lo2 = Thought61.getInstance(ao1, ao2, ao3, ao4);
        ab1 = ab2 || ab3;
        Output.points[6][8] -= fd0;
}
Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    ab4 = ad4 > fd0;
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m3();
}
    ad1 = ad2 - ad3;
    fb0 = ad4 < fd0;
if(ao3 != null){
      fb1 = ao3.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ad1;
    Output.points[7][0] -= ad2;
    ad3 *= -1;
    Thought lo0 = Thought110.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
    Thought lo1 = Thought354.getInstance(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
    Thought lo2 = Thought394.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld3 = 851.2050805479582;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld3, ad1);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought53.getInstance(fb0, fb1, fb0, fb1);
    Output.points[7][1] += fd0;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought87.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb2 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Output.points[7][2] -= fd0;
    Thought lo4 = Thought387.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Thought lo5 = Thought65.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb2);
}
    Output.points[7][3] += fd1;
            fd0 = fd1 + fd0;
    lb3 = fd1 < fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        double ld0 = 305.1069777436281;
    fb0 = ld0 < fd0;
    fb1 = !ab1;
    ab2 = ab3 && ab4;
    double ld1 = 172.7021486264797;
    fb0 = !fb1;
    fd0 = fd1 - ld0;
    Thought lo2 = Thought268.getInstance(ld1, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Output.points[7][4] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[7][5] -= fd1;
    Thought lo3 = Thought4.getInstance(ld0, ld1, fd0, fd1);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
    boolean lb4 = true;
    double ld5 = 907.6018838667204;
if(fo0 != null){
      lb4 = fo0.m2();
}
    Output.points[7][6] -= ld0;
if(fo1 != null){
          ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    boolean lb6 = true;

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    double ld1 = 485.1962737105829;
    Output.points[7][7] += ld1;
    lb0 = ad1 < ad2;
    double ld2 = 370.9060644820866;
        fb0 = fb1 || lb0;
    ad2 *= -1;
    fb0 = !fb1;
    Thought lo3 = Thought155.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(ld1, ld2, ad1, ad2, fb0, fb1, lb0, fb0);
}
        boolean lb4 = false;
        boolean lb5 = true;
        ad3 = ad4 + fd0;
        Thought lo6 = Thought47.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb4);
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 313.0807882552684;
    Thought lo1 = Thought77.getInstance(fo0, fo1, fo0, fo1);
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      ab2 = fo0.m2(fd1, ld0, ad1, ad2);
}
    ab3 = !ab4;
    fb0 = !fb1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    fd0 *= -1;
    ab1 = ab2 && ab3;
    fd1 = ld0 + ad1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
    fd1 = ld0 + ad1;
        ad2 = ad3 - ad4;
    if (ab4) {
        fb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(ld0, ad1, ad2, ad3, fb1, lb2, ab1, ab2);
}
        ab3 = ab4 && fb0;
}
Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought12.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = !fb1;
    fd0 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
        if (fb0) {
        fd1 = fd0 + fd1;
        boolean lb1 = true;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
        fd0 = fd1 + fd0;
        fb1 = fd1 < fd0;
        lb1 = fd1 > fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
        boolean lb2 = false;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ad1 = ad2 + ad3;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Output.points[7][8] -= fd1;
    lb0 = !fb0;
    boolean lb1 = false;
    fb0 = fb1 || lb0;
    lb1 = ad1 > ad2;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, lb1, fb0);
}
    fb1 = ad3 > ad4;
    lb0 = lb1 || fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought309.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought61.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
    Thought lo2 = Thought147.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb3, ab1, ab2, ab3);
}
    double ld4 = 258.6294077505903;
    double ld5 = 872.4148535760497;
    ld4 *= -1;
    ab4 = !fb0;
    ld5 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld4, ld5, fd0, fd1, fb1, lb3, ab1, ab2);
}
    boolean lb6 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld4, ld5, fd0, fd1);
}
    double ld7 = 984.5103446836105;
if(ao4 != null){
      ld4 = ao4.m3(fo0, fo1, ao1, ao2, ld5, ld7, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ld4 = ld5 + ld7;
    Output.points[8][0] += fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    Output.points[8][1] += ad1;
    boolean lb0 = true;
    Thought lo1 = Thought57.getInstance(ao2, ao3, ao4, fo0);
    ab3 = !ab4;
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
    boolean lb2 = false;
    ad1 *= -1;
    Output.points[8][2] -= ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad3 = ad4 - fd0;
if(ao2 != null){
          fd1 = ao2.m3(fb0, fb1, lb0, lb2);
}
    ab1 = ad1 < ad2;
    ad3 = ad4 + fd0;
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(ad4, fd0, fd1, ad1, fb1, lb0, lb2, lb3);
}
    ab1 = !ab2;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 763.6437505884745;
        fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    double ld1 = 302.19034783809013;
    Thought lo2 = Thought140.getInstance(fo1, fo0, fo1, fo0);
    ld0 = ld1 + fd0;
    fb0 = fb1 || fb0;
    Output.points[8][3] += fd1;
if(fo1 != null){
      fo1.m3(ld0, ld1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    double ld3 = 357.2615679630013;
    double ld4 = 94.50735241909754;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ld3, ld4);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2();
}
    boolean lb0 = true;
    Thought lo1 = Thought322.getInstance(ab1, ab2, ab3, ab4);
    double ld2 = 740.040450370815;
    ld2 *= -1;
    fb0 = !fb1;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ld2 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ld2 *= -1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 926.6233064058453;
if(fo1 != null){
      fo1.m1(ld3, fd0, fd1, ld2);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    Thought lo0 = Thought315.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    Thought lo1 = Thought66.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad3 *= -1;
    Thought lo2 = Thought399.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 || fb1;
    fb0 = fd1 > ad1;
    Thought lo3 = Thought263.getInstance(fb1, fb0, fb1, fb0);
    ad2 *= -1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = !ab1;
    Thought lo0 = Thought254.getInstance(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
    fb1 = ad4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[8][4] -= ad1;
    fb0 = fb1 && ab1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      lb2 = fo1.m2();
}
    ab1 = !ab2;
    ad1 = ad2 + ad3;
    boolean lb3 = false;
    ab2 = ab3 || ab4;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought253.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Output.points[8][5] += fd1;
    Output.points[8][6] -= fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fb1 = !fb0;
    double ld1 = 34.80150042761083;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;
    fd0 *= -1;
    fd1 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
    if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4();
}
        boolean lb2 = false;
if(ao4 != null){
          ao3 = ao4.m4(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);
}
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = !fb1;
        fb0 = fd1 < ad1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb0 = false;
    fb0 = ad2 < ad3;
if(ao2 != null){
      fb1 = ao2.m2(ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    lb0 = !lb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(fb0, fb1, lb0, lb1);
}
    double ld2 = 706.27562596974;
    boolean lb3 = true;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ld2, ad1, ad2, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, lb1, lb3, fb0, fb1);
}
    ld2 *= -1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Thought lo0 = Thought191.getInstance(fd0, fd1, fd0, fd1);
    ab1 = fd0 > fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3();
}
    double ld1 = 180.42679963471159;
    ab3 = fd0 < fd1;
if(fo0 != null){
      ld1 = fo0.m3(ab4, fb0, fb1, ab1);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld0 = 99.91162625712485;
    ad4 = fd0 - fd1;
    ld0 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    ld0 = ad1 - ad2;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought131.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb1, ab1, ab2, ab3);
}
    ab4 = ld0 < ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    double ld2 = 325.40654790942204;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = !fb1;
    Thought lo0 = Thought195.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = true;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        lb1 = fd0 < fd1;
    boolean lb2 = true;
    fd0 = fd1 + fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
    boolean lb2 = true;
    fd1 *= -1;
    boolean lb3 = true;
    Thought lo4 = Thought269.getInstance(lb1, lb2, lb3, fb0);
    boolean lb5 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought359.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought323.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
        fd0 *= -1;
    fb0 = fd1 < fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
